package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Char],T_A[Byte]), b: Boolean, c: (T_A[Int],T_A[Int])) extends T_A[T_A[Int]]
case class CC_B(a: Char) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B('x') => 1 
  case CC_B(_) => 2 
}
}