package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[Boolean, T_A[Int, Int]]]
case class CC_B(a: T_A[Byte, CC_A[Int]], b: T_B[CC_A[Char], Int], c: (CC_A[Boolean],T_B[Byte, Char])) extends T_A[T_B[T_B[Int, Int], T_A[Char, Int]], T_A[Boolean, T_A[Int, Int]]]
case class CC_C(a: CC_A[Char], b: Int) extends T_A[T_B[T_B[Int, Int], T_A[Char, Int]], T_A[Boolean, T_A[Int, Int]]]
case class CC_D[G, F](a: Boolean) extends T_B[F, G]

val v_a: T_A[T_B[T_B[Int, Int], T_A[Char, Int]], T_A[Boolean, T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(), _) => 2 
}
}