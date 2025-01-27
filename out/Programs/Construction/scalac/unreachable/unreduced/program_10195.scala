package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Byte, b: T_B[T_A], c: (T_B[T_A],T_A)) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D(a: Int) extends T_B[((CC_B,CC_B),T_B[CC_B])]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,CC_A(_, _, _))) => 0 
  case CC_A(_, _, (_,CC_B())) => 1 
  case CC_A(_, _, (_,CC_C(_))) => 2 
  case CC_B() => 3 
  case CC_C(_) => 4 
}
}