package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: (T_B[Boolean, Byte],T_A[Boolean, Int])) extends T_A[T_B[Byte, Byte], T_B[T_A[Char, Char], T_B[(Int,Int), Boolean]]]
case class CC_B(a: T_B[CC_A, Int], b: T_A[T_B[CC_A, Byte], T_B[CC_A, CC_A]]) extends T_A[T_B[Byte, Byte], T_B[T_A[Char, Char], T_B[(Int,Int), Boolean]]]
case class CC_C(a: CC_B, b: (((Boolean,Byte),CC_B),(CC_A,CC_A)), c: (T_B[(Boolean,Int), CC_B],Byte)) extends T_A[T_B[Byte, Byte], T_B[T_A[Char, Char], T_B[(Int,Int), Boolean]]]
case class CC_D[E, F]() extends T_B[T_A[CC_A, CC_A], E]
case class CC_E[G]() extends T_B[T_A[CC_A, CC_A], G]
case class CC_F[H](a: Int, b: T_B[T_A[CC_A, CC_A], H], c: T_B[T_A[CC_A, CC_A], H]) extends T_B[T_A[CC_A, CC_A], H]

val v_a: T_A[T_B[Byte, Byte], T_B[T_A[Char, Char], T_B[(Int,Int), Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(CC_B(_, _), ((_,_),(_,_)), _)