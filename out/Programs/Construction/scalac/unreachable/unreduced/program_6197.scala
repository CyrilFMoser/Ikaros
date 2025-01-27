package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: ((T_A,T_A),T_B[T_A])) extends T_A
case class CC_B(a: CC_A, b: T_B[T_B[CC_A]]) extends T_B[T_B[CC_A]]
case class CC_C(a: CC_A, b: Char, c: CC_A) extends T_B[T_B[CC_A]]
case class CC_D(a: T_B[CC_B], b: CC_B) extends T_B[T_B[CC_A]]

val v_a: T_B[T_B[CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, (_,_)), _) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(_, _) => 2 
}
}