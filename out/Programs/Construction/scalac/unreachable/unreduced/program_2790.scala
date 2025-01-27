package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Int, b: T_A[T_A[T_B]], c: (T_A[T_B],T_A[Byte])) extends T_A[Byte]
case class CC_B() extends T_B
case class CC_C(a: T_B) extends T_B
case class CC_D(a: Boolean, b: T_A[CC_A], c: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_C(CC_B())) => 1 
  case CC_C(CC_C(CC_C(_))) => 2 
  case CC_C(CC_C(CC_D(_, _, _))) => 3 
  case CC_C(CC_D(_, _, _)) => 4 
  case CC_D(true, _, CC_B()) => 5 
  case CC_D(false, _, CC_B()) => 6 
}
}
// This is not matched: CC_C(CC_B())