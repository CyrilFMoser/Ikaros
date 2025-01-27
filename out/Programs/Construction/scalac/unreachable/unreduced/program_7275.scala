package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Byte, T_B[Int, Char]], b: (Int,T_A[Char])) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: Byte, b: CC_A) extends T_A[T_A[T_A[Byte]]]
case class CC_C[D](a: D, b: Char, c: CC_A) extends T_A[D]
case class CC_D[E](a: CC_B, b: Int, c: CC_B) extends T_B[E, CC_B]
case class CC_E(a: (CC_B,CC_C[CC_A]), b: CC_C[T_A[(Boolean,Boolean)]]) extends T_B[Char, CC_B]
case class CC_F() extends T_B[CC_E, (T_B[Char, CC_B],CC_B)]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,CC_C(_, _, _))) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, CC_A(_, (_,_))) => 2 
}
}