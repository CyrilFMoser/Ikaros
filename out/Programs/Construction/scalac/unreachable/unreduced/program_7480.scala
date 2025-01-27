package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: Boolean, b: T_B[(Char,(Boolean,Byte)), T_A[Char, Int]]) extends T_A[T_A[T_A[Char, Int], T_B[(Byte,Byte), (Byte,Byte)]], T_B[Char, T_A[Boolean, Byte]]]
case class CC_B[E, F, G]() extends T_B[E, F]
case class CC_C[I, H](a: I, b: CC_A) extends T_B[I, H]
case class CC_D[J, K](a: T_B[J, CC_A], b: T_A[K, K], c: T_A[K, J]) extends T_B[K, J]

val v_a: T_B[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
  case CC_D(CC_B(), _, _) => 2 
  case CC_D(CC_C(_, _), _, _) => 3 
  case CC_D(CC_D(_, _, _), _, _) => 4 
}
}