package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: (T_A[Boolean, Int],T_A[Byte, Char])) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]
case class CC_C(a: T_A[T_A[Boolean, Char], Char], b: Int, c: Byte) extends T_A[T_A[Boolean, Boolean], Boolean]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, (_,_)), (_,_)) => 0 
  case CC_A(CC_B(CC_A(_, _)), (_,_)) => 1 
  case CC_A(CC_B(CC_B(_)), (_,_)) => 2 
  case CC_B(CC_A(CC_A(_, _), (_,_))) => 3 
  case CC_B(CC_A(CC_B(_), (_,_))) => 4 
  case CC_B(CC_B(_)) => 5 
}
}