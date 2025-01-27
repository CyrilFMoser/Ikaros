package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Boolean], T_B[Int, Byte]]) extends T_A[T_B[T_B[Byte, Int], T_B[Char, Int]]]
case class CC_B(a: CC_A) extends T_A[T_B[T_B[Byte, Int], T_B[Char, Int]]]
case class CC_C(a: T_B[Boolean, CC_B], b: T_A[(Char,CC_A)], c: (CC_A,CC_B)) extends T_A[T_B[T_B[Byte, Int], T_B[Char, Int]]]
case class CC_D[E, D](a: CC_B, b: (CC_C,(CC_B,Int)), c: CC_C) extends T_B[D, E]
case class CC_E() extends T_B[Boolean, CC_A]
case class CC_F[G, F]() extends T_B[G, F]

val v_a: T_B[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(CC_A(_)), (CC_C(_, _, _),(_,_)), CC_C(CC_D(_, _, _), _, (_,_))) => 0 
  case CC_D(CC_B(CC_A(_)), (CC_C(_, _, _),(_,_)), CC_C(CC_F(), _, (_,_))) => 1 
  case CC_F() => 2 
}
}