package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: (T_B[T_A, Byte],T_A)) extends T_A
case class CC_B[C]() extends T_A
case class CC_C(a: T_B[CC_A, T_B[CC_A, CC_A]], b: CC_B[(T_A,Boolean)], c: T_B[CC_A, T_A]) extends T_B[CC_A, T_B[CC_A, CC_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), (_,CC_A(_, _))) => 0 
  case CC_A(CC_A(CC_A(_, _), _), (_,CC_B())) => 1 
  case CC_A(CC_A(CC_B(), _), (_,CC_A(_, _))) => 2 
  case CC_A(CC_B(), (_,CC_A(_, _))) => 3 
  case CC_A(CC_B(), (_,CC_B())) => 4 
  case CC_B() => 5 
}
}
// This is not matched: CC_A(CC_A(CC_B(), _), (_,CC_B()))