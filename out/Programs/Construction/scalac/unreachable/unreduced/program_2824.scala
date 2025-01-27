package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: Char, c: (T_B[T_A, (Int,Int)],T_A)) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D[C, D]() extends T_B[C, Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,CC_A(_, _, _))) => 0 
  case CC_A(_, _, (_,CC_B())) => 1 
  case CC_A(_, _, (_,CC_C())) => 2 
  case CC_C() => 3 
}
}
// This is not matched: CC_B()