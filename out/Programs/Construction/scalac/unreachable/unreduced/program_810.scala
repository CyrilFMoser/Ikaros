package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: D, b: T_B[D]) extends T_A[D, E]
case class CC_B[F, G](a: ((Byte,Char),Char)) extends T_A[F, G]
case class CC_C[H]() extends T_B[CC_B[((Int,Byte),Char), T_A[Char, Byte]]]
case class CC_D(a: CC_B[Char, Boolean], b: T_A[((Boolean,Char),(Byte,Boolean)), T_A[(Boolean,Int), Int]], c: T_A[CC_C[Char], T_B[Byte]]) extends T_B[CC_B[((Int,Byte),Char), T_A[Char, Byte]]]
case class CC_E() extends T_B[CC_B[((Int,Byte),Char), T_A[Char, Byte]]]

val v_a: T_B[CC_B[((Int,Byte),Char), T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_B(_), CC_A(_, _), CC_A(_, _)) => 1 
  case CC_D(CC_B(_), CC_B(_), CC_A(_, _)) => 2 
  case CC_D(CC_B(_), CC_A(_, _), CC_B(_)) => 3 
  case CC_D(CC_B(_), CC_B(_), CC_B(_)) => 4 
}
}
// This is not matched: CC_E()