package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Char],T_A[Char]), b: (T_A[Int],T_A[Byte]), c: T_A[T_A[Int]]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: CC_A, b: CC_A, c: CC_A) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: Boolean) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B(_, CC_A((_,_), (_,_), _), _) => 1 
  case CC_C(_) => 2 
}
}