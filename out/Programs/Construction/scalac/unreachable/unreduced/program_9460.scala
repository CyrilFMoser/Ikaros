package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: (Boolean,T_B[Char, Boolean]), c: Byte) extends T_A[D]
case class CC_B[E, F](a: T_B[E, F]) extends T_A[E]
case class CC_C[G](a: (T_A[Int],(Boolean,Byte)), b: Boolean) extends T_A[G]
case class CC_D[H]() extends T_B[H, CC_C[T_A[Boolean]]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}