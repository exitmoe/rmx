/* Generated By:JJTree: Do not edit this line. ASTArg.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=BaseNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package logic.parse.SOP;

public
class ASTArg extends SimpleNode {
  public ASTArg(int id) {
    super(id);
  }

  public ASTArg(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=f9383d7be30ca3970a3d2751a87517f7 (do not edit this line) */
