package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_A[Byte]]) extends T_A[T_A[T_A[(Boolean,Int)]]]
case class CC_B(a: (CC_A,(CC_A,CC_A)), b: CC_A, c: CC_A) extends T_A[T_A[T_A[(Boolean,Int)]]]
case class CC_C(a: CC_B) extends T_A[T_A[T_A[(Boolean,Int)]]]

val v_a: T_A[T_A[T_A[(Boolean,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((CC_A(_, _),(_,_)), CC_A(_, _), CC_A(_, _)) => 1 
  case CC_C(_) => 2 
}
}