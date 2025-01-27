package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Byte],T_A[Boolean]), b: T_A[(Char,Boolean)], c: T_A[T_A[Char]]) extends T_A[T_A[T_A[(Char,Int)]]]
case class CC_B(a: CC_A, b: CC_A) extends T_A[Int]
case class CC_C(a: T_A[Int]) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A((_,_), _, _), CC_A(_, _, _)) => 0 
  case CC_C(_) => 1 
}
}