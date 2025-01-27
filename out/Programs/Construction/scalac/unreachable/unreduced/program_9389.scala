package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char) extends T_A[T_A[C, C], C]
case class CC_B(a: (CC_A[Byte],((Int,Byte),Int)), b: Char, c: T_A[T_A[Boolean, Boolean], T_A[Char, Char]]) extends T_A[T_A[T_A[T_A[(Boolean,Char), (Boolean,Char)], (Boolean,Char)], T_A[T_A[(Boolean,Char), (Boolean,Char)], (Boolean,Char)]], T_A[T_A[(Boolean,Char), (Boolean,Char)], (Boolean,Char)]]

val v_a: T_A[T_A[T_A[T_A[(Boolean,Char), (Boolean,Char)], (Boolean,Char)], T_A[T_A[(Boolean,Char), (Boolean,Char)], (Boolean,Char)]], T_A[T_A[(Boolean,Char), (Boolean,Char)], (Boolean,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}