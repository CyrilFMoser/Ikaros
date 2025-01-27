package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: (T_A[(Byte,Char), T_B],T_A[T_B, T_B]), b: T_B) extends T_A[T_A[T_B, T_A[Char, T_B]], T_B]
case class CC_B() extends T_A[T_A[T_B, T_A[Char, T_B]], T_B]
case class CC_C(a: CC_B, b: CC_A) extends T_B

val v_a: T_A[T_A[T_B, T_A[Char, T_B]], T_B] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
// This is not matched: CC_A((_,_), CC_C(CC_B(), _))