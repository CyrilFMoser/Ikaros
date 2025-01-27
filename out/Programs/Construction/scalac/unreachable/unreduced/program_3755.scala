package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: (T_A[T_B, (Boolean,Int)],T_A[T_B, Byte]), b: T_A[T_A[T_B, T_B], Int], c: T_A[((Int,Byte),T_B), T_A[T_B, T_B]]) extends T_A[T_B, T_A[T_B, T_A[T_B, T_B]]]
case class CC_B(a: T_A[CC_A, T_A[T_B, (Int,Int)]]) extends T_A[T_B, T_A[T_B, T_A[T_B, T_B]]]
case class CC_C(a: T_B, b: T_A[T_B, (Byte,CC_B)], c: T_B) extends T_A[T_B, T_A[T_B, T_A[T_B, T_B]]]
case class CC_D() extends T_B
case class CC_E(a: T_A[T_B, CC_C]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_) => 1 
}
}