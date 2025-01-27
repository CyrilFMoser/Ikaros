package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Byte]) extends T_A[Byte]
case class CC_B[C](a: CC_A, b: T_A[Byte]) extends T_A[C]
case class CC_C[D]() extends T_A[Byte]
case class CC_D(a: T_A[T_B[CC_A]], b: (T_B[CC_A],CC_A)) extends T_B[T_A[Byte]]
case class CC_E(a: T_B[T_B[CC_D]], b: CC_D) extends T_B[T_A[Byte]]
case class CC_F() extends T_B[T_A[Byte]]

val v_a: T_B[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, _), _) => 0 
  case CC_E(_, CC_D(CC_B(_, _), (_,_))) => 1 
  case CC_F() => 2 
}
}