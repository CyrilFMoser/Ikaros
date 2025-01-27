package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[C], b: T_A[B], c: (T_A[Char],T_A[Int])) extends T_A[B]
case class CC_B(a: Byte, b: T_A[T_A[Boolean]]) extends T_A[Int]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), (_,_)), (CC_A(_, _, _),CC_A(_, _, _))) => 0 
  case CC_A(_, CC_A(_, CC_A(_, _, _), (_,_)), (CC_A(_, _, _),CC_B(_, _))) => 1 
}
}