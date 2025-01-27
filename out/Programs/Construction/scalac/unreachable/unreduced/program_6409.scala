package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B() extends T_B[T_B[Boolean, CC_A], T_B[T_B[CC_A, CC_A], CC_A]]
case class CC_C(a: CC_A) extends T_B[T_B[Boolean, CC_A], T_B[T_B[CC_A, CC_A], CC_A]]
case class CC_D(a: (T_A,T_B[CC_C, Byte])) extends T_B[T_B[Boolean, CC_A], T_B[T_B[CC_A, CC_A], CC_A]]

val v_a: T_B[T_B[Boolean, CC_A], T_B[T_B[CC_A, CC_A], CC_A]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_)) => 1 
  case CC_D((CC_A(_),_)) => 2 
}
}