package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Int, b: Boolean, c: T_A) extends T_A
case class CC_B(a: (T_B[CC_A],T_A), b: T_A) extends T_A
case class CC_C() extends T_B[T_B[(CC_B,CC_A)]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((_,CC_A(_, _, _)), CC_A(_, true, CC_A(_, _, _))) => 1 
  case CC_B((_,CC_B(_, _)), CC_A(_, true, CC_A(_, _, _))) => 2 
  case CC_B((_,CC_A(_, _, _)), CC_A(_, true, CC_B(_, _))) => 3 
  case CC_B((_,CC_B(_, _)), CC_A(_, true, CC_B(_, _))) => 4 
  case CC_B((_,CC_A(_, _, _)), CC_A(_, false, CC_A(_, _, _))) => 5 
  case CC_B((_,CC_B(_, _)), CC_A(_, false, CC_A(_, _, _))) => 6 
  case CC_B((_,CC_A(_, _, _)), CC_A(_, false, CC_B(_, _))) => 7 
  case CC_B((_,CC_B(_, _)), CC_A(_, false, CC_B(_, _))) => 8 
  case CC_B((_,CC_A(_, _, _)), CC_B(_, _)) => 9 
  case CC_B((_,CC_B(_, _)), CC_B(_, _)) => 10 
}
}