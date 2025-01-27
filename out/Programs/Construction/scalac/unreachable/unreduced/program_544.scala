package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte, b: T_A[T_A[Boolean]], c: T_B[T_B[Int]]) extends T_A[T_B[T_A[Boolean]]]
case class CC_B[C](a: T_A[C]) extends T_B[C]
case class CC_C(a: Int) extends T_B[T_A[T_B[CC_A]]]
case class CC_D(a: (T_B[(Boolean,Char)],T_B[(Boolean,Int)]), b: CC_B[T_A[CC_A]], c: T_A[Byte]) extends T_B[T_A[T_B[CC_A]]]

val v_a: T_B[T_A[T_B[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(12) => 1 
  case CC_C(_) => 2 
  case CC_D(_, CC_B(_), _) => 3 
}
}