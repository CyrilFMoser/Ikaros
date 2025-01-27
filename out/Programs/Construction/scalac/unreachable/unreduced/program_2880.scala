package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Boolean) extends T_A
case class CC_B(a: Boolean, b: (T_B[CC_A],T_A), c: CC_A) extends T_A
case class CC_C(a: T_B[T_A], b: CC_A, c: CC_B) extends T_A
case class CC_D(a: Int, b: CC_C) extends T_B[((T_A,CC_C),Char)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(true, _, CC_A(_)) => 1 
  case CC_B(false, _, CC_A(_)) => 2 
  case CC_C(_, _, _) => 3 
}
}