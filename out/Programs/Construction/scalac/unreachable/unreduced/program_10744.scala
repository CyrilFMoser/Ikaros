package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_B[C], c: Int) extends T_A[C]
case class CC_B[D](a: (Char,(Boolean,Int)), b: T_B[D]) extends T_A[D]
case class CC_C[E](a: T_A[E]) extends T_A[E]
case class CC_D(a: T_A[Byte], b: T_A[Byte]) extends T_B[Byte]
case class CC_E(a: Boolean, b: Boolean, c: (CC_A[CC_D],T_B[CC_D])) extends T_B[Byte]
case class CC_F() extends T_B[Byte]

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, CC_A(_, _, _)), _, _) => 0 
  case CC_A(CC_D(_, CC_B(_, _)), _, _) => 1 
  case CC_A(CC_D(_, CC_C(_)), _, _) => 2 
  case CC_B(_, _) => 3 
  case CC_C(_) => 4 
}
}