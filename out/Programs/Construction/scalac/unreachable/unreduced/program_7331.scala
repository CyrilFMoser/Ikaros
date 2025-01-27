package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Boolean, b: T_B[T_A[Boolean]], c: T_B[T_A[Byte]]) extends T_A[T_A[T_B[Char]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_B[Char]]]
case class CC_C[C](a: C, b: T_B[C], c: CC_B) extends T_B[C]
case class CC_D[D](a: (T_B[Byte],((Boolean,Boolean),CC_A))) extends T_B[D]
case class CC_E() extends T_B[T_B[CC_C[CC_B]]]

val v_a: T_A[T_A[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, CC_C(_, _, _))) => 1 
  case CC_B(CC_A(_, _, CC_D(_))) => 2 
}
}