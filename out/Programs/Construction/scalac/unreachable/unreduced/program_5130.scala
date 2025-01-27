package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]]) extends T_A[Byte]
case class CC_B(a: (T_A[CC_A],T_A[Byte]), b: T_A[Byte], c: T_A[Byte]) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}