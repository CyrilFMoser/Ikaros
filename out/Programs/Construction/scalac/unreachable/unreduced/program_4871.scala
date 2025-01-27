package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: ((Byte,Int),T_A[Boolean, Byte]), b: T_A[C, Byte]) extends T_A[C, Byte]
case class CC_B(a: (T_A[Int, Int],T_A[Int, Byte]), b: T_A[T_A[Byte, Byte], Byte], c: CC_A[CC_A[Int]]) extends T_A[Int, Byte]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),CC_A(_, _)), CC_A((_,_), _)) => 0 
  case CC_A(((_,_),CC_A(_, _)), CC_B((_,_), CC_A(_, _), CC_A(_, _))) => 1 
  case CC_B(_, _, _) => 2 
}
}