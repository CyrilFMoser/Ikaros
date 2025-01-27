package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Int, b: T_A[D]) extends T_A[D]
case class CC_B() extends T_A[T_B[T_A[Boolean], Int]]
case class CC_C[E](a: (T_A[(Int,Byte)],T_A[CC_B]), b: E) extends T_A[E]
case class CC_D() extends T_B[Int, CC_C[T_A[CC_B]]]
case class CC_E(a: CC_A[T_B[Boolean, CC_B]]) extends T_B[Int, CC_C[T_A[CC_B]]]
case class CC_F(a: T_A[Byte]) extends T_B[Int, CC_C[T_A[CC_B]]]

val v_a: T_A[T_A[T_B[T_A[Boolean], Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_C(_, _))) => 1 
  case CC_A(_, CC_C((_,_), _)) => 2 
  case CC_C((CC_A(_, _),CC_A(_, _)), CC_A(_, _)) => 3 
  case CC_C((CC_A(_, _),CC_C(_, _)), CC_A(_, _)) => 4 
  case CC_C((CC_C(_, _),CC_A(_, _)), CC_A(_, _)) => 5 
  case CC_C((CC_C(_, _),CC_C(_, _)), CC_A(_, _)) => 6 
  case CC_C((CC_A(_, _),CC_A(_, _)), CC_B()) => 7 
  case CC_C((CC_A(_, _),CC_C(_, _)), CC_B()) => 8 
  case CC_C((CC_C(_, _),CC_A(_, _)), CC_B()) => 9 
  case CC_C((CC_C(_, _),CC_C(_, _)), CC_B()) => 10 
  case CC_C((CC_A(_, _),CC_A(_, _)), CC_C(_, _)) => 11 
  case CC_C((CC_A(_, _),CC_C(_, _)), CC_C(_, _)) => 12 
  case CC_C((CC_C(_, _),CC_A(_, _)), CC_C(_, _)) => 13 
  case CC_C((CC_C(_, _),CC_C(_, _)), CC_C(_, _)) => 14 
}
}