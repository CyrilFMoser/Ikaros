package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[T_A[C, C], C], c: T_A[C, C]) extends T_A[C, T_A[T_A[Byte, Char], T_A[Byte, Char]]]
case class CC_B(a: (CC_A[(Byte,Int)],T_A[Boolean, Int]), b: T_A[Int, CC_A[(Int,Int)]]) extends T_A[CC_A[CC_A[Boolean]], T_A[T_A[Byte, Char], T_A[Byte, Char]]]
case class CC_C(a: CC_A[CC_B]) extends T_A[CC_A[CC_A[Boolean]], T_A[T_A[Byte, Char], T_A[Byte, Char]]]

val v_a: T_A[CC_A[CC_A[Boolean]], T_A[T_A[Byte, Char], T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((CC_A(_, _, _),_), _) => 1 
  case CC_C(_) => 2 
}
}