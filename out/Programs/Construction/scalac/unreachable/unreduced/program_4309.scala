package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[T_A[T_A[T_A[Byte, Int], Char], T_A[T_A[Byte, Int], Char]], T_A[T_A[Byte, Int], Char]], b: D, c: D) extends T_A[T_A[D, D], D]
case class CC_B[G](a: T_A[Boolean, G]) extends T_A[Boolean, G]
case class CC_C[H](a: CC_B[H], b: T_A[Boolean, H]) extends T_B[H]
case class CC_D[I](a: T_B[I], b: (T_B[Byte],T_A[Char, Int])) extends T_B[I]
case class CC_E() extends T_B[(T_B[Int],Char)]

val v_a: T_B[(T_B[Int],Char)] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(CC_B(_)), _) => 0 
  case CC_D(_, (CC_C(_, _),_)) => 1 
  case CC_D(_, (CC_D(_, _),_)) => 2 
  case CC_E() => 3 
}
}