package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Boolean]], b: T_B[T_A[Byte]], c: T_B[T_A[Boolean]]) extends T_A[T_B[T_A[Byte]]]
case class CC_B(a: (CC_A,Boolean), b: T_B[T_B[(Int,Char)]]) extends T_A[T_B[T_A[Byte]]]
case class CC_C() extends T_B[CC_B]
case class CC_D(a: CC_B) extends T_B[CC_B]
case class CC_E(a: T_B[CC_A]) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_E(_) => 1 
}
}
// This is not matched: CC_D(CC_B((_,_), _))