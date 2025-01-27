package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[D, E]
case class CC_B[F]() extends T_A[Char, F]
case class CC_C[G](a: G, b: (T_B[Char],T_B[Int]), c: T_A[G, G]) extends T_A[G, T_A[Char, G]]
case class CC_D(a: T_A[T_B[Char], T_A[Char, T_B[Char]]], b: (CC_A[(Boolean,Int), (Byte,Char)],T_B[Char])) extends T_B[Int]
case class CC_E(a: T_A[CC_D, T_A[CC_D, CC_D]], b: CC_D) extends T_B[Int]

val v_a: T_A[Boolean, T_A[Char, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, (_,CC_D(_, _)), CC_A()) => 1 
  case CC_C(_, (_,CC_E(_, _)), CC_A()) => 2 
}
}