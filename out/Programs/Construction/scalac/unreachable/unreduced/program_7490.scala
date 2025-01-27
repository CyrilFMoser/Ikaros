package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[((T_B,Byte),T_A[Byte, T_B]), C]
case class CC_B(a: T_A[Byte, (T_B,T_B)]) extends T_A[((T_B,Byte),T_A[Byte, T_B]), (CC_A[T_B],CC_A[Char])]
case class CC_C() extends T_A[((T_B,Byte),T_A[Byte, T_B]), (CC_A[T_B],CC_A[Char])]
case class CC_D(a: CC_A[Int]) extends T_B
case class CC_E(a: T_A[CC_D, CC_A[T_B]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A(CC_D(_))) => 0 
  case CC_D(CC_A(CC_E(_))) => 1 
  case CC_E(_) => 2 
}
}