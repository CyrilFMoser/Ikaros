package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_A[C], c: T_A[C]) extends T_A[C]
case class CC_B[D](a: T_B[D], b: ((Int,Int),T_A[Boolean])) extends T_A[D]
case class CC_C() extends T_A[T_B[T_A[Char]]]
case class CC_D(a: CC_C, b: T_A[Int], c: CC_A[T_A[CC_C]]) extends T_B[CC_B[Byte]]
case class CC_E(a: CC_C, b: CC_A[Byte], c: CC_D) extends T_B[CC_B[Byte]]
case class CC_F() extends T_B[CC_B[Byte]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(_, (_,_))) => 1 
  case CC_B(_, _) => 2 
}
}