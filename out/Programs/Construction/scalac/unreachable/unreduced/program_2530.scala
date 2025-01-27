package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_B[E, E], c: E) extends T_A[T_A[T_A[Char, Byte], T_A[Int, Boolean]], E]
case class CC_B[F, G](a: CC_A[F], b: (CC_A[Byte],(Byte,Byte)), c: T_B[G, F]) extends T_B[G, F]
case class CC_C[H, I](a: T_B[I, H], b: T_A[H, I]) extends T_B[H, I]

val v_a: T_B[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, CC_B(_, _, _), _), (CC_A(_, _, _),(_,_)), CC_B(_, (_,_), CC_B(_, _, _))) => 0 
  case CC_B(CC_A(_, CC_C(_, _), _), (CC_A(_, _, _),(_,_)), CC_B(_, (_,_), CC_B(_, _, _))) => 1 
  case CC_B(CC_A(_, CC_B(_, _, _), _), (CC_A(_, _, _),(_,_)), CC_B(_, (_,_), CC_C(_, _))) => 2 
  case CC_B(CC_A(_, CC_C(_, _), _), (CC_A(_, _, _),(_,_)), CC_B(_, (_,_), CC_C(_, _))) => 3 
  case CC_B(CC_A(_, CC_B(_, _, _), _), (CC_A(_, _, _),(_,_)), CC_C(_, _)) => 4 
  case CC_B(CC_A(_, CC_C(_, _), _), (CC_A(_, _, _),(_,_)), CC_C(_, _)) => 5 
  case CC_C(CC_B(_, _, _), _) => 6 
  case CC_C(CC_C(_, _), _) => 7 
}
}