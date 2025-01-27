package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char) extends T_A
case class CC_B(a: T_B[T_B[CC_A]]) extends T_B[T_A]
case class CC_C(a: (T_A,((Char,Char),CC_B)), b: T_A, c: CC_A) extends T_B[T_A]
case class CC_D(a: CC_B, b: CC_B, c: Int) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C((_,_), _, _) => 1 
}
}
// This is not matched: CC_D(_, CC_B(_), _)