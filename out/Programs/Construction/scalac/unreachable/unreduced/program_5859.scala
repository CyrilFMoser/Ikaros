package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: (T_A[Char, Char],((Byte,Char),Boolean)), b: Char) extends T_A[T_B[Boolean], T_A[T_B[Char], T_A[Boolean, Byte]]]
case class CC_B(a: CC_A, b: Char, c: T_A[T_A[CC_A, Int], T_B[CC_A]]) extends T_A[T_B[Boolean], T_A[T_B[Char], T_A[Boolean, Byte]]]
case class CC_C(a: CC_B) extends T_A[T_B[Boolean], T_A[T_B[Char], T_A[Boolean, Byte]]]
case class CC_D[D](a: (CC_B,((Boolean,Int),CC_C)), b: (CC_A,T_B[CC_C])) extends T_B[D]

val v_a: T_A[T_B[Boolean], T_A[T_B[Char], T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(CC_B(CC_A(_, _), _, _))