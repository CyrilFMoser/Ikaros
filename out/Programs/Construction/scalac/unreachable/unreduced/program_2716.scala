package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B, T_B], T_A[T_B, T_B]], b: T_A[T_A[T_B, T_B], T_B], c: T_B) extends T_A[Char, T_A[T_A[T_B, (Boolean,Int)], T_A[T_B, T_B]]]
case class CC_B() extends T_A[Char, T_A[T_A[T_B, (Boolean,Int)], T_A[T_B, T_B]]]
case class CC_C() extends T_B
case class CC_D(a: CC_A) extends T_B
case class CC_E(a: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, CC_C())) => 0 
  case CC_D(CC_A(_, _, CC_D(_))) => 1 
  case CC_D(CC_A(_, _, CC_E(_))) => 2 
  case CC_E(_) => 3 
}
}
// This is not matched: CC_C()