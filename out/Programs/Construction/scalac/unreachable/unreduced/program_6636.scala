package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Int, Char], Int], b: T_A[T_B[Int, Char]], c: (T_A[Char],T_B[Boolean, Char])) extends T_A[T_B[T_B[Byte, Byte], T_A[Int]]]
case class CC_B(a: Byte, b: CC_A) extends T_A[T_B[T_B[Byte, Byte], T_A[Int]]]
case class CC_C[D]() extends T_A[T_B[T_B[Byte, Byte], T_A[Int]]]
case class CC_D[E, F](a: F) extends T_B[E, F]

val v_a: T_A[T_B[T_B[Byte, Byte], T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(12), _, (_,CC_D(_))) => 0 
  case CC_A(CC_D(_), _, (_,CC_D(_))) => 1 
  case CC_C() => 2 
}
}
// This is not matched: CC_B(_, _)