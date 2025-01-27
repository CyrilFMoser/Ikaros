package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char, b: T_A[Boolean], c: Byte) extends T_A[Boolean]
case class CC_B(a: T_A[CC_A], b: (T_A[Boolean],CC_A), c: T_A[T_A[Byte]]) extends T_A[Boolean]
case class CC_C(a: Boolean, b: T_A[Boolean], c: (CC_B,T_A[Boolean])) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(_, _, _), _) => 1 
  case CC_A(_, CC_C(_, CC_A(_, _, _), (_,_)), _) => 2 
  case CC_A(_, CC_C(_, CC_B(_, _, _), (_,_)), _) => 3 
  case CC_A(_, CC_C(_, CC_C(_, _, _), (_,_)), _) => 4 
  case CC_B(_, _, _) => 5 
  case CC_C(_, _, _) => 6 
}
}