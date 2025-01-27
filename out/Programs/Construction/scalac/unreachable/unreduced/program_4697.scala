package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: CC_A[D], b: (CC_A[Char],T_A[Byte, Byte])) extends T_A[T_A[D, D], D]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_B(CC_A(_), (_,_))) => 2 
}
}