package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: (T_B[(Char,Char), Int],(Byte,Byte)), b: T_B[T_A[Boolean, Int], T_A[Int, Int]]) extends T_A[(T_B[Char, Int],T_B[Int, Int]), T_A[T_B[Int, Char], T_A[Int, Int]]]
case class CC_B[F, E](a: F) extends T_A[E, F]
case class CC_C(a: Int, b: T_B[T_A[CC_A, (Int,Byte)], (CC_A,(Char,Int))], c: T_B[T_A[CC_A, Boolean], T_A[CC_A, CC_A]]) extends T_A[(T_B[Char, Int],T_B[Int, Int]), T_A[T_B[Int, Char], T_A[Int, Int]]]
case class CC_D[G](a: T_A[G, G], b: (CC_C,T_A[CC_C, CC_C]), c: T_B[G, G]) extends T_B[T_B[G, T_B[G, G]], G]

val v_a: T_A[(T_B[Char, Int],T_B[Int, Int]), T_A[T_B[Int, Char], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B(CC_B(_)) => 1 
}
}
// This is not matched: CC_C(_, _, _)