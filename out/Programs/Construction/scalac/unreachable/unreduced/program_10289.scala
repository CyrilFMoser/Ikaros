package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Char, Boolean], b: T_A[Char, Boolean]) extends T_A[Char, Boolean]
case class CC_B(a: T_A[T_A[CC_A, Char], T_A[CC_A, CC_A]], b: Boolean, c: (Byte,Boolean)) extends T_A[Char, Boolean]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_, _, (_,_)), _) => 1 
  case CC_B(_, true, _) => 2 
  case CC_B(_, false, _) => 3 
}
}