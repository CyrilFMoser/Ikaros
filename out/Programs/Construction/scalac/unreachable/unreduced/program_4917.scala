package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[(Boolean,Byte), Int], T_A[Int, Boolean]], T_A[T_A[Char, (Boolean,Boolean)], Int]]
case class CC_B(a: T_A[T_A[Boolean, CC_A], (CC_A,CC_A)], b: T_A[Int, Byte]) extends T_A[T_A[T_A[(Boolean,Byte), Int], T_A[Int, Boolean]], T_A[T_A[Char, (Boolean,Boolean)], Int]]

val v_a: T_A[T_A[T_A[(Boolean,Byte), Int], T_A[Int, Boolean]], T_A[T_A[Char, (Boolean,Boolean)], Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}