package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[(Boolean,Char)], b: (T_A[Byte],T_A[Char])) extends T_A[T_B[T_A[Int]]]
case class CC_B(a: T_A[T_A[CC_A]]) extends T_A[T_B[T_A[Int]]]
case class CC_C(a: T_A[T_A[(Byte,Char)]], b: CC_A, c: (CC_A,T_A[CC_A])) extends T_A[T_B[T_A[Int]]]
case class CC_D[C](a: Int, b: C) extends T_B[C]
case class CC_E(a: T_B[CC_A], b: T_B[CC_A], c: T_B[Byte]) extends T_B[CC_A]
case class CC_F(a: CC_B, b: CC_B) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_E(_, CC_D(_, CC_A(_, _)), CC_D(_, _)) => 0 
  case CC_E(_, CC_E(_, _, _), CC_D(_, _)) => 1 
  case CC_E(_, CC_F(CC_B(_), CC_B(_)), CC_D(_, _)) => 2 
  case CC_F(_, _) => 3 
}
}
// This is not matched: CC_D(_, CC_A(CC_D(_, _), (_,_)))