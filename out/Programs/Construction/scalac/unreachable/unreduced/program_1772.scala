package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Boolean, Int],T_A[Char, Int]), b: C, c: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[CC_A[(Int,Byte)], CC_A[Boolean]], b: T_A[T_A[T_A[Boolean, Char], T_A[Boolean, Char]], T_A[Boolean, Char]]) extends T_A[T_A[T_A[T_A[CC_A[Int], CC_A[Int]], CC_A[Int]], T_A[T_A[CC_A[Int], CC_A[Int]], CC_A[Int]]], T_A[T_A[CC_A[Int], CC_A[Int]], CC_A[Int]]]
case class CC_C(a: CC_A[T_A[CC_B, CC_B]]) extends T_A[T_A[T_A[T_A[CC_A[Int], CC_A[Int]], CC_A[Int]], T_A[T_A[CC_A[Int], CC_A[Int]], CC_A[Int]]], T_A[T_A[CC_A[Int], CC_A[Int]], CC_A[Int]]]

val v_a: T_A[T_A[T_A[T_A[CC_A[Int], CC_A[Int]], CC_A[Int]], T_A[T_A[CC_A[Int], CC_A[Int]], CC_A[Int]]], T_A[T_A[CC_A[Int], CC_A[Int]], CC_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}