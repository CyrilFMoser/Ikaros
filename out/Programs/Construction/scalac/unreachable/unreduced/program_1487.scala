package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B[D](a: D, b: T_B[D], c: D) extends T_A[D]
case class CC_C(a: T_A[CC_A[Char]], b: (T_A[Byte],T_B[Byte]), c: T_A[Char]) extends T_B[CC_B[T_A[Char]]]
case class CC_D(a: CC_A[CC_C]) extends T_B[CC_B[T_A[Char]]]
case class CC_E(a: (CC_B[CC_D],Byte), b: T_A[CC_C], c: CC_C) extends T_B[CC_B[T_A[Char]]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
  case CC_B(_, _, _) => 2 
}
}