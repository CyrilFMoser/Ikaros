package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[(Boolean,Boolean), Int], T_A[Int, Byte]], T_A[T_A[Boolean, (Boolean,Boolean)], Byte]]
case class CC_B(a: T_A[T_A[CC_A, CC_A], T_A[(Boolean,Char), (Boolean,Char)]], b: T_A[T_A[(Boolean,Boolean), CC_A], CC_A]) extends T_A[T_A[T_A[(Boolean,Boolean), Int], T_A[Int, Byte]], T_A[T_A[Boolean, (Boolean,Boolean)], Byte]]

val v_a: T_A[T_A[T_A[(Boolean,Boolean), Int], T_A[Int, Byte]], T_A[T_A[Boolean, (Boolean,Boolean)], Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}