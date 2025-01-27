package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[E, E]) extends T_A[E, T_A[E, E]]
case class CC_B[G](a: T_A[G, T_A[G, G]], b: ((Byte,Int),T_A[Boolean, Boolean]), c: T_A[G, G]) extends T_A[G, T_A[G, G]]
case class CC_C[H]() extends T_A[H, T_A[H, H]]
case class CC_D[I](a: (Boolean,CC_C[Int]), b: Int) extends T_B[I, Int]
case class CC_E[J](a: (Int,T_B[Int, Char]), b: T_A[J, T_A[J, J]]) extends T_B[J, Int]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), ((_,_),_), _) => 1 
  case CC_B(CC_B(_, _, _), ((_,_),_), _) => 2 
  case CC_B(CC_C(), ((_,_),_), _) => 3 
  case CC_C() => 4 
}
}