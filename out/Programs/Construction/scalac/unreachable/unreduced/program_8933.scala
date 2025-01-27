package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[T_A[T_A[Int, (Boolean,Int)], T_A[Int, (Boolean,Int)]], T_A[T_A[Int, (Boolean,Int)], T_A[Int, (Boolean,Int)]]], T_A[T_A[Int, (Boolean,Int)], T_A[Int, (Boolean,Int)]]]) extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[T_A[Byte, Byte], Byte], b: (Byte,CC_A[Boolean]), c: (CC_A[Byte],T_A[Char, (Boolean,Int)])) extends T_A[T_A[T_A[T_A[CC_A[Int], CC_A[Int]], CC_A[Int]], T_A[T_A[CC_A[Int], CC_A[Int]], CC_A[Int]]], T_A[T_A[CC_A[Int], CC_A[Int]], CC_A[Int]]]
case class CC_C() extends T_A[T_A[T_A[T_A[CC_A[Int], CC_A[Int]], CC_A[Int]], T_A[T_A[CC_A[Int], CC_A[Int]], CC_A[Int]]], T_A[T_A[CC_A[Int], CC_A[Int]], CC_A[Int]]]

val v_a: T_A[T_A[T_A[T_A[CC_A[Int], CC_A[Int]], CC_A[Int]], T_A[T_A[CC_A[Int], CC_A[Int]], CC_A[Int]]], T_A[T_A[CC_A[Int], CC_A[Int]], CC_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), (_,CC_A(_)), (CC_A(_),_)) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_)