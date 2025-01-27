package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: (CC_A[Boolean],(Boolean,Int)), b: T_B[T_A[Int], (Int,Byte)]) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: T_B[CC_A[CC_B], Byte]) extends T_A[T_A[T_A[Byte]]]
case class CC_D[E](a: CC_B, b: E) extends T_B[E, Byte]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_D(CC_B(_, _), _)) => 2 
}
}